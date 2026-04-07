const API = "http://localhost:8080"

function login(){

let email=document.getElementById("email").value
let password=document.getElementById("password").value

fetch(API+"/auth/login",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:JSON.stringify({
email:email,
password:password
})

})

.then(res=>res.text())
.then(token=>{

localStorage.setItem("token",token)

window.location="dashboard.html"

})

}

function logout(){

localStorage.removeItem("token")

window.location="index.html"

}

function getToken(){

return localStorage.getItem("token")

}

function loadSummary(){

fetch(API+"/dashboard/summary",{

headers:{
Authorization:"Bearer "+getToken()
}

})

.then(res=>res.json())

.then(data=>{

document.getElementById("income").innerText=data.totalIncome

document.getElementById("expense").innerText=data.totalExpense

document.getElementById("balance").innerText=data.netBalance

})

}

function createRecord(){

let record={

amount:document.getElementById("amount").value,

type:document.getElementById("type").value,

category:document.getElementById("category").value,

date:document.getElementById("date").value,

notes:document.getElementById("notes").value,

userId:1

}

fetch(API+"/records",{

method:"POST",

headers:{

"Content-Type":"application/json",

Authorization:"Bearer "+getToken()

},

body:JSON.stringify(record)

})

.then(()=>{

loadRecords()
loadSummary()

})

}

function loadRecords(){

fetch(API+"/records",{

headers:{
Authorization:"Bearer "+getToken()
}

})

.then(res=>res.json())

.then(data=>{

let table=document.getElementById("recordsTable")

table.innerHTML=""

data.forEach(r=>{

table.innerHTML+=`
<tr>
<td>${r.amount}</td>
<td>${r.type}</td>
<td>${r.category}</td>
<td>${r.date}</td>
<td>${r.notes}</td>
</tr>
`

})

})

}

if(window.location.pathname.includes("dashboard.html")){

loadSummary()

loadRecords()

}