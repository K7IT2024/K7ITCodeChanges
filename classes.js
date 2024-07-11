class Animal{
    constructor(name,age,weight,height)
    {
    this.name=name;
    this.age=age;
    this.weight=weight;
    this.height=height;
    }
    
    
}
a1=new Animal("Tiger",75,90,4.5)
a2=new Animal("Lion",85,95,5.5)

console.log(a1)
console.log(a2.name)
class Bank{
    constructor(bankName,branch,address,accountNumber){
        this.bankName=bankName;
        this.branch=branch;
        this.address=address;
        this.accountNumber=accountNumber;
    }
}
b1=new Bank("stateBank","settipalli","renigunta",12345)
let b2=new Bank("axis","jayanthiNagar","bangalore",45678)
console.log(b1)
b2.name="indian"
console.log(b2.name)
b3=b2
console.log(b3)

