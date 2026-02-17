import csv
import os
from datetime import datetime

# Our fixed Day 0
DAY_ZERO = datetime(2021, 1, 20)

def convert_date_to_int(date_str):
    try:
        # Appending 2021 for the Spring 2021 semester math
        formatted_str = f"{date_str}/2021"
        target_date = datetime.strptime(formatted_str, "%m/%d/%Y")
        delta = target_date - DAY_ZERO
        return delta.days
    except ValueError:
        print(f"!! Warning: Could not parse '{date_str}'. Expected MM/DD.")
        return None

def run():
    if not os.path.exists('fields.txt'):
        print("Error: Run modify_add_assignment.py first.")
        return
    
    with open('fields.txt', 'r') as f:
        fields = [line.strip() for line in f if line.strip()]

    # We want date_integer to be the 5th field in the CSV
    # even if it's not in our 'fields.txt' prompt list.
    csv_headers = fields + ["date_integer"]

    data = {}
    print(f"--- Adding Progress (Day 0: {DAY_ZERO.strftime('%m/%d/%Y')}) ---")
    
    for field in fields:
        val = input(f"Enter {field.replace('_', ' ')}: ")
        data[field] = val
        
        # Calculate the integer when we hit the due_date field
        if field == "assignment_due_date":
            data["date_integer"] = convert_date_to_int(val)

    # Save to CSV using the expanded headers
    file_exists = os.path.isfile('assignment_data.csv')
    with open('assignment_data.csv', 'a', newline='') as f:
        writer = csv.DictWriter(f, fieldnames=csv_headers)
        
        if not file_exists:
            writer.writeheader()
        
        writer.writerow(data)
    
    print(f"\nSaved! '{data['assignment_name']}' is Day {data['date_integer']} of the course.")

if __name__ == "__main__":
    run()
