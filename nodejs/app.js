//It can access all the baremetal actual hardware.
const os=require('os');
const fs=require('fs');
const http=require('http')

const express=require('express');
const bodyparser=require("body-parser")

//console.log(os.arch(),os.freemem(),os.homedir(),os.hostname(),os.uptime());
// fs.readFile('names.txt',(err,data)=>{
//     if(err){
//         console.log(err);
        
//     }else{
//         console.log(data.toString());
        
//     }
// })

// fs.writeFile("names.txt","Hello IBM",(err)=>{
//     if(err){
//         console.log(err);
        
//     }else{
//         console.log("File written sucessfully");
        
//     }
// })



//with the node js no express js
// function gethtmlsync(filename){
//     return  fs.readFileSync("C:\\Users\\AbhishekGoud\\Desktop\\IBM Training Cloud Full Stack\\DAY-01\\".concat(filename),(err,data)=>{
//         if(err){
//             console.log(err);
            
//         }else{
//             console.log(data.toString());
//             return data.toString()
            
//         }
//     })

// }

// const myserver=http.createServer((req,res)=>{
//     if(req.url=="/render"){
//         res.writeHead(200,{"content-type":"text/html"})
//         res.end( gethtmlsync("form.html"))

//     }else if(req.url=="/basic"){
//         res.writeHead(200,{"content-type":"text/html"})
//         res.end( gethtmlsync("index.html"))

//     }
// })

// myserver.listen(8000,()=>console.log("Bluetooth Device paired")
// )


const app=express();
app.use(bodyparser.urlencoded({ extended: true }));
app.use(express.json());

app.post('/login',(req,res)=>{
    const email=req.body.email;
    const password=req.body.password;

    if(email==="abhi@gmail.com" && password==="12345"){
        return res.json({
            "name":"Abhishek Goud",
            "Role":"Associate System Engineer",
            "msg":"Successfully logged in"
        })

    }else{
        res.status(401).json({
            "error":"Invalid credentials"
        })
    }

    console.log(email,password);

})

const path = require('path');
const { log } = require('console');


app.get('/render', async(req, res) => {
   await res.sendFile(path.join("C:\\Users\\AbhishekGoud\\Desktop\\IBM Training Cloud Full Stack\\DAY-01\\form.html"))
});

app.get("/basic",async(req,res)=>{
    await res.sendFile(path.join("C:\\Users\\AbhishekGoud\\Desktop\\IBM Training Cloud Full Stack\\DAY-01\\index.html"))
})

app.get('/home',async(req,res)=>{
    res.json({
        "name":"Abhishek",
        "Age":24
    })

})

app.listen(8000,()=>console.log("Application Started")
)


