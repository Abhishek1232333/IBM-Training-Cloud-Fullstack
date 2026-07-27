const mongoose=require('mongoose');

const quizSchema=new mongoose.Schema({
    title:{type:String,required:true},
    description:{type:String},
    CreatedAt:{type:Date,default:Date.now}
});

const Quiz=mongoose.model("Quiz",quizSchema);

module.exports={Quiz};