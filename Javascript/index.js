//console.log("Hello Abhishek");

let a=5;
let b=11.2;

// console.log(a+b);
//console.log(typeof(a));

let arr=[1,2.3,55,"IBM"]
// console.log(typeof(arr));
// console.log(arr);

// for(let i of arr){
//     console.log(i);
    
// }

// for(let i in arr){
//     console.log(arr[i]);
// }

//function
// function sum(a,b){
//     console.log(a+b);
    
// }
// sum(a,b);


// let x=5;
// var y=10;

// {
//     let x=20;
//     var y=22;
//     console.log("Inside block:",x);
//     console.log("Inside block:",y);
    
// }
//  console.log("oustside block:",x);
//  console.log("oustside block:",y);


//String functions

let str="Bangalore"

// console.log(str.length);
// console.log(str.split());
// console.log(`I live in ${str}`);

// console.log(arr.indexOf("IBM"));
// console.log(arr+arr);


// arr.forEach(e=>console.log(e)
// );

// s=(a,b)=>{
//     return a-b;
// }

// console.log(s(a,b));

//object creation::
// let obj={
//     "name":"Abhi",
//     "Role":"ASE",

// }

// console.log(obj);

// let cal={
//     "sum":(a,b)=>a+b,
//     "sub":(a,b)=>a-b,
//     "mul":(a,b)=>a*b,
//     "div":(a,b)=>a/b,
// }

// console.log(cal.sum(a,b));


//Filter method

// arr.filter((e)=>e%2!=0).forEach((e)=>console.log(e)
// )

// arr.map((e)=>e*2).forEach((e)=>console.log(e)
// )

// arr.map((e)=>e*2).forEach((e)=>console.log(e)
// )

// arr.filter((e)=>typeof(e)=="number").map((e)=>e*10).forEach((e)=>console.log(e)
// )



// Callback function
// function greet(){
//     console.log("Welcome to the page");
    
// }

// function start(func){
//     func();
// }

// start(greet)


//setTimeout and setinterval
// const s=setTimeout(()=>{
//     console.log("Hi welcome!!");
    
// },1000);

// clearTimeout(s);

// console.log("Just in Time");

// let count=0;
// const st=setInterval(()=>{
//     console.log("HI Team 1");
//     count++;
//     if(count>5){
//         clearInterval(st)
//     }
    
// },1000);


//promise
// function getdata(){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             if(1==1){
//                 resolve("Sucessfully Logged in");
//             }else{
//                 reject("Unauthorized access")
//             }

//         },1000)
//     })
// }

// getdata().then((data)=>console.log(data)).catch((err)=>console.log(err)
// );



// fetch Url in JS
fetch("https://jsonplaceholder.typicode.com/todos/1").then(response => response.json())
      .then(json => console.log(json))











