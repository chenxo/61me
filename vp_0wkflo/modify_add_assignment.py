def run():
    print("--- Modify Assignment Fields ---")
    print("Enter the fields you want, separated by commas (e.g., name, date, priority)")
    user_input = input("> ")
    
    # Split by comma and clean up whitespace
    new_fields = [f.strip() for f in user_input.split(',') if f.strip()]

    if not new_fields:
        print("No fields entered. Aborting.")
        return

    # Overwrite the config file
    with open('fields.txt', 'w') as f:
        for field in new_fields:
            f.write(field + "\n")
            
    print(f"\nUpdated! Next time you run add_assignment.py, it will ask for: {', '.join(new_fields)}")
    print("Note: Changing fields may cause headers in assignment_data.csv to become unaligned.")

if __name__ == "__main__":
    run()
