const logNames = async () => {const response = await fetch("/api/names");
};

(()=> {
const namesEl = document.getElementById("names");
logNames().then(names => {namesEl.innerHTML = names.join(" | ")})})();