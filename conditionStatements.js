//if & else condition
let a=10,b=20
if(a<b){
        console.log("true");
}else{
        console.log("false");
}

//if-else if-else condition
a=10,b=80,c=30
if(a>b){
    console.log("a is greatest");
}else if(b>c){
    console.log("b is greatest");
}else{
    console.log("c is greatest");
} 

//Nested if condition
d=123;
if(d>0){
    if(d==123){
        console.log("valid");
    }else{
        console.log("not valid");
    }
}else{
    console.log("enter valid number");
}

//switch
let day="sunday"
switch(day){
    case("monday"):
    console.log("day is monday");
    break;
    case("tuesday"):
    console.log("day is tuesday");
    break;
    case("wed"):
    console.log("day is wed");
    break;
    case("thursday"):
    console.log("day is thursday");
    break;
    case("friday"):
    console.log("day is friday");
    break;
    case("satday"):
    console.log("day is satday");
    break;
    case("sunday"):
    console.log("day is sunday");
    break;
    default:
        console.log("holiday");
}