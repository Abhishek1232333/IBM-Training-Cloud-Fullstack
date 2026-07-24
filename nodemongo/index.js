const express=require('express');
const connectDB = require('./db');
require('dotenv').config();
const bodyparser=require('body-parser')
const {Quiz} =require('./models/quiz')


const port=process.env.PORT

app=express()
app.use(express.json());
app.use(bodyparser.urlencoded({ extended: true }));

connectDB().then(()=>{
    console.log("Database connection established");
    
}).catch((err)=>{
    console.log("Database connection error:",err);
    
})

app.get('/getAllQuizes',async(req,res)=>{
    Quiz.find().then(quizees=>{
        res.json(quizees);
    })
})

app.post("/createQuiz",async(req,res)=>{
    const{title,description}=req.body;

    const newQuiz=new Quiz({
        title,
        description,
    })
    newQuiz.save().then(savedQuiz=>{
        res.json(savedQuiz)
    }).catch(err=>{
        res.status(500).json({error:"Failed to create a quiz"})
    })
})

app.get("/quiz/:id", async (req, res) => {
  try {
    const quiz = await Quiz.findById(req.params.id);

    if (!quiz) {
      return res.status(404).json({
        message: "Quiz not found",
      });
    }

    res.status(200).json(quiz);
  } catch (error) {
    res.status(500).json({
      message: error.message,
    });
  }
});

app.listen(port,()=>console.log(`Example app listening on port ${port}!`)
)
