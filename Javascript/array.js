const fruits = ["apple","mango","banana"];

fruits.push("Pineapple");
console.log(fruits);
fruits.pop()
console.log(fruits);
fruits.unshift("Jackfruit");
console.log(fruits);
fruits.shift()
console.log(fruits);
fruits.splice(1,1,"peach");
console.log(fruits);

console.log(fruits.reverse());

console.log(fruits.sort());


const nums = [10,20,30,40,50];
nums.at(-1)         
nums.slice(1,3)     
nums.join(" - ")    
// 50 (last item)
// [20,30]
// "10 - 20 - 30..."
nums.includes(20)   // true
nums.indexOf(30)    // 2
nums.length         //5


let a=[10,20,30];
let b=a;
console.log(a==b);


