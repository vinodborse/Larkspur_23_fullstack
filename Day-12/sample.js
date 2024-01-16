
async function dataSearch() {
    
    const val = document.getElementById('inp').value;

    const url = "https://dummyjson.com/products/"+val;

    const data = await fetch(url, {method: 'GET'});
    console.log("MY DATA = ", data);
    const finalData = await data.json();

    document.getElementById('dt').innerHTML = "<h1 style='color: red'> Title:- " + finalData.title +"</h1> <h1 style='color: green'> Price:- $" + finalData.price +"</h1>";

}

