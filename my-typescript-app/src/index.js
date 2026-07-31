"use strict";
// let age: number = 30;
// let name: string = "Alice";
// let active: boolean = true;
// // Inferred (preferred) — TS infers number
Object.defineProperty(exports, "__esModule", { value: true });
// console.log(age,name,active);
// let roles: string[] = ["admin", "user"];
// // or: Array<string>
// // Tuple — fixed length & order enforced
// let user: [number, string, boolean]
// = [1, "Alice", true];
// // Enum — compiles to reverse-mapped JS object
// enum Role { ADMIN = 0, USER = 1 }
// // Object shape
// const person: { name: string; age: number }
// = { name: "Alice", age: 30 };
// console.log(roles);
// console.log(user);
// console.log(person);
// console.log(Role);
// let x: any = "hello";
// x = 42; 
// console.log(typeof x);
// unknown — type-safe any
// Must narrow before use
// function getInput(name:string):string{
//     return name;
// }
// let input: unknown = getInput("Abhishek");
// if (typeof input === "string") {
// console.log(input.toUpperCase()); //
// }
// function sum(...nums: number[]): number {
// return nums.reduce((a, b) => a + b, 0);
// }
// console.log(sum(10,20));
// var — function-scoped, hoisted (bug!)
// for (var i = 0; i < 3; i++) {
// setTimeout(() => console.log(i), 100);
// }
// // Prints: 3, 3, 3
class Department {
    id;
    name;
    created;
    static fiscalYear = 2026;
    constructor(id, name, created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }
    //getter
    get fullName() { return this.name; }
}
class ITDepartment extends Department {
    constructor(id) {
        super(id, "IT", new Date());
    }
    describe() {
        console.log("IT Dept #" + this.id);
    }
}
//# sourceMappingURL=index.js.map