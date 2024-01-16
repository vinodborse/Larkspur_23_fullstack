
async function dataSearch() {
    
    const val = document.getElementById('inp').value;

    const url = "http://localhost:8080/get-student?rollno="+val;

    const data = await fetch(url, {method: 'GET'});
    console.log("MY DATA = ", data);
    const finalData = await data.json();

    document.getElementById('dt').innerHTML = "<h1 style='color: red'> Name:- " + finalData.name +"</h1> <h1 style='color: green'> Address:- " + finalData.address +"</h1>";

}

