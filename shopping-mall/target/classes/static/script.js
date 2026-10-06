alert("JavaScript is working");

const form = document.getElementById("mallForm");

form.addEventListener("submit", function(event) {

    event.preventDefault();

    alert("Add Mall button is working");

    const mall = {
        id: document.getElementById("id").value,
        name: document.getElementById("name").value,
        location: document.getElementById("location").value
    };

    alert(JSON.stringify(mall));

    fetch("/save", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(mall)
    })
    .then(response => response.json())
    .then(data => {

        alert("Mall added successfully!");

        form.reset();

        getMalls();
    })
    .catch(error => {

        console.log(error);

        alert("Error adding mall");
    });
});


function getMalls() {

    fetch("/allmall")
    .then(response => response.json())
    .then(data => {

        let output = "";

        data.forEach(mall => {

            output += `
                <p>
                    ID: ${mall.id}
                    | Name: ${mall.name}
                    | Location: ${mall.location}
                </p>
            `;
        });

        document.getElementById("mallList").innerHTML = output;
    });
}