 
const marks = [55, 82, 91, 43, 77, 68];
max=marks[0];
min=marks[0];
sum=0
for (const item of marks) {
    if(item>max){
        max=item;
    }
    if(item<min){
        min=item;
    }
    sum+=item;


}

console.log("Maximum number",max);
console.log("Minimum number:",min);
console.log("Average:",sum/marks.length);

marks.forEach((m)=>{if(m>60){console.log(m)}})
