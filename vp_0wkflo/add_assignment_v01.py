import csv
import os

def run():
    # 1. Load the current fields
    if not os.path.exists('fields.txt'):
        print("Error: fields.txt not found. Run the modify script first.")
        return
    
    with open('fields.txt', 'r') as f:
        fields = [line.strip() for line in f if line.strip()]

    # 2. Collect data from user
    data = {}
    print("--- Add New Assignment ---")
    for field in fields:
        data[field] = input(f"Enter {field.replace('_', ' ')}: ")

    # 3. Save to CSV
    file_exists = os.path.isfile('assignment_data.csv')
    
    with open('assignment_data.csv', 'a', newline='') as f:
        writer = csv.DictWriter(f, fieldnames=fields)
        
        # Write header only if the file is new
        if not file_exists:
            writer.writeheader()
            
        writer.writerow(data)
    
    print("\nSuccess! Data saved to assignment_data.csv")

if __name__ == "__main__":
    run()
