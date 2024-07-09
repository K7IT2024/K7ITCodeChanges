//type convertions
//string to number
let a="abc";
console.log(Number(a));
console.log(typeof a);

let b="123"
console.log(Number(b));
console.log(typeof(b));

//number to string
let c=123;
console.log(String(c));
console.log(typeof c);

let d=2;
let e=String(d);
console.log(e);
console.log(typeof e);

//boolean to number
let f=false;
console.log(Number(false));

//number to boolean 
let g=123;
console.log(Boolean(g));

let h=0;
console.log(Boolean(h));

let i=1;
console.log(Boolean(i));  

//dates to number
let j=new Date();
console.log(Number(j));
console.log(j);
console.log(typeof j);
date=j.getTime();
console.log(date);

//date to string
let k=(Number(j));
console.log(String(j));
console.log(typeof j);