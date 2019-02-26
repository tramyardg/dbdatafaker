## DBDataFaker
Generates inserts query for <br />
- [x] Employee 
- [ ] Department (to be implemented)
- [ ] Instructor (to be implemented)
- [ ] Student (to be implemented)
- [ ] Course (to be implemented)
- [ ] and so on ...

## Usage
**Employee demo** 
```java
public class App {
    public static void main(String[] args) {
        // Employee demo
        int N = 10; // number of rows
        for (int i = 0; i < N; i++) {
            System.out.println(new ConcreteEmployeeBuilder()
                    .buildFirstName()
                    .buildLastName()
                    .buildAddress()
                    .build().toString());
        }
    }
}
```
This generates 10 rows of employee's insert queries.
```sql
insert into employee (first_name,last_name,address) values ("Cara","Cremin","515 Kuvalis Locks, Morriston, PE");
insert into employee (first_name,last_name,address) values ("Jarrell","Kunde","20356 Carey Flats, South Alanis, QC");
insert into employee (first_name,last_name,address) values ("Clark","Lowe","86216 Ethyl Village, South Alexzanderstad, NT");
insert into employee (first_name,last_name,address) values ("Sonya","Beer","531 Bruen Viaduct, Hickleberg, NL");
insert into employee (first_name,last_name,address) values ("Liam","Hyatt","295 Xzavier Plain, Lake Keegan, QC");
insert into employee (first_name,last_name,address) values ("Romaine","Wyman","9160 Green Way, North Lenna, QC");
insert into employee (first_name,last_name,address) values ("Katlynn","Schmeler","611 Pete Curve, Bodemouth, PE");
insert into employee (first_name,last_name,address) values ("Vivien","Schuppe","15766 Orn Throughway, Lydiafort, ON");
insert into employee (first_name,last_name,address) values ("Jeromy","Brakus","9058 Shields Ranch, Anthonyfort, PE");
insert into employee (first_name,last_name,address) values ("Roselyn","Kris","312 Felipa Route, Fritschbury, BC");
``` 