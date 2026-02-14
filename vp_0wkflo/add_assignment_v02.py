import csv
import os
from datetime import datetime

# Our fixed Day 0
DAY_ZERO = datetime(2021, 1, 20)

def convert_date_to_int(date_str):
    try:
        # Appending 2021 to ensure the math stays within that specific year
        formatted_str = f"{date_str}/2021"
        target_date = datetime.strptime(formatted_str, "%m/%d/%Y")
        delta = target_date - DAY_ZERO
        return delta.days
    except ValueError:
        return date_str  # Return original if format is wrong

def run():
    if not os.path.exists('fields.txt'):
        print("Error: Run modify_add_assignment.py first to set fields.")
        return
    
    with open('fields.txt', 'r') as f:
        fields = [line.strip() for line in f if line.strip()]

    data = {}
    print(f"--- Adding Progress (Day 0: {DAY_ZERO.strftime('%m/%d/%Y')}) ---")
    
    for field in fields:
        val = input(f"Enter {field.replace('_', ' ')}: ")
        
        # Check if this is the date field we want to convert
        if field == "assignment_due_date":
            val = convert_date_to_int(val)
            
        data[field] = val

    file_exists = os.path.isfile('assignment_data.csv')
    with open('assignment_data.csv', 'a', newline='') as f:
        writer = csv.DictWriter(f, fieldnames=fields)
        if not file_exists:
            writer.writeheader()
        writer.writerow(data)
    
    print(f"\nSaved! Date integer: {data.get('assignment_due_date')}")

if __name__ == "__main__":
    run()
