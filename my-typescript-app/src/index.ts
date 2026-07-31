
// let age: number = 30;
// let name: string = "Alice";
// let active: boolean = true;
// // Inferred (preferred) — TS infers number

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




// abstract class Department{
//     static fiscalYear=2026;

//     constructor(
//         public id:string,
//         private name:string,
//         readonly created:Date
//     ){}

//     //getter
//     get fullName(){return this.name}

//     //abstract
//     abstract describe(): void;

// }

// class ITDepartment extends Department {
//     constructor(id: string) {
//     super(id, "IT", new Date());
//     }
//     describe() {
//     console.log("IT Dept #" + this.id);
//     }
// }



// typeof — primitives
// let x:string="Abhi";
// if (typeof x === "string") {
//     console.log(x.trim());
// }


// class Animal {
//   eat() {
//     console.log("Animal is eating");
//   }
// }

// class Dog extends Animal {
//   bark() {
//     console.log("Woof! Woof!");
//   }
// }

// class Cat extends Animal {
//   meow() {
//     console.log("Meow!");
//   }
// }

// let animal: Animal = new Dog();

// // Check if animal is actually a Dog
// if (animal instanceof Dog) {
//   animal.bark();
// }


// type LoadingState = { kind: "loading" };
// type SuccessState = {
// kind: "success";
// data: "Successfull login to the IBM";
// };
// type ErrorState = {
// kind: "error";
// message: "Candidate not found!!";
// };
// type NetworkState =
// | LoadingState
// | SuccessState
// | ErrorState;


// function handleState(state: NetworkState) {
//     switch (state.kind) {
//         case "loading":
//             return "Loading...";
//         case "success":
//             return state.data; //
// }
// }

// console.log(handleState({ kind: "loading" }));
// console.log({kind:"success"});
// console.log({kind:"error"});


// With generics — return type mirrors input
// function identity<T>(arg:T):T{
//     return arg;
// }

// const ch=identity(13);
// console.log(ch,typeof(ch));

// result: string

type Listener={
    kind:"Listening";
}
type Project={
    kind:"project";
}
class ProjectState{
    private static instance:ProjectState;
    private listeners:Listener[]=[];
    private projects:Project[]=[];

    static getInstance(){
        if(!this.instance){
            this.instance=new ProjectState();
        }
        return this.instance;
    }

    addListener(fn:Listener){
        this.listeners.push(fn)
    }

    addProject(title:string,desc:string,people:number){
        this.projects.push(new Project(
            Math.random().toString(),title,desc,people,ProjectStatus.Active
        ));
        this.listeners.forEach(
            fn=>fn([...this.projects])
        )
    }

}