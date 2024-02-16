class CardWanted extends HTMLElement {

    constructor() {
        super();

        const shadow = this.attachShadow({ mode: "open" });
        shadow.appendChild(this.build());
        shadow.appendChild(this.styles());
    }

    build() {
        const componentRoot = document.createElement("div");
        componentRoot.setAttribute("class", "card_wanted");

        const card_wanted_left = document.createElement("div");
        card_wanted_left.setAttribute("class", "card_wanted_left");

        const wantedTitle = document.createElement("h1");
        wantedTitle.textContent = "Wanted";

        const wantedStatus = document.createElement("span");
        wantedStatus.textContent = `${this.getAttribute("wantedStatus") || "Only Alive"}`;

        const rewardValue = document.createElement("p");
        rewardValue.textContent = "₿" + ` ${this.getAttribute("rewardValue") || "0"}`;

        const solicitor = document.createElement("span");
        solicitor.setAttribute("class", "left");
        solicitor.textContent = "By" + ` ${this.getAttribute("solicitor") || "Anonymous"}`;

        card_wanted_left.appendChild(wantedTitle);
        card_wanted_left.appendChild(wantedStatus);
        card_wanted_left.appendChild(rewardValue);
        card_wanted_left.appendChild(solicitor);

        const card_wanted_right = document.createElement("div");
        card_wanted_right.setAttribute("class", "card_wanted_right");
        const wantedImg = document.createElement("img");
        wantedImg.src = this.getAttribute("wantedImg") || "assets/defaultImg.png";
        wantedImg.alt = `Foto de ${this.getAttribute("wantedName") || "Unknown"}`;

        const wantedName = document.createElement("p");
        wantedName.setAttribute("class", "name");
        wantedName.textContent = `${this.getAttribute("wantedName") || "Unknown"}`;

        card_wanted_right.appendChild(wantedImg);
        card_wanted_right.appendChild(wantedName);

        componentRoot.appendChild(card_wanted_left);
        componentRoot.appendChild(card_wanted_right);

        return componentRoot
    }

    styles() {
        const style = document.createElement("style");
        style.textContent = `
        * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        /*font-family: 'Segoe UI', sans-serif;*/
    }
        .card_wanted {
            width: 720px;
            border-radius: 10%;
            border: 1px solid gray;
            display: flex;
            flex-direction: row;
            background-image: url('../assets/back.png');
            background-size: cover;
            border-radius: 30px;
            box-shadow: 10px 10px 19px 0px rgba(0, 0, 0, 0.75);
            -webkit-box-shadow: 10px 10px 19px 0px rgba(0, 0, 0, 0.75);
            -moz-box-shadow: 10px 10px 19px 0px rgba(0, 0, 0, 0.75);
            margin-top: 30px;
        }
        
        .card_wanted_left,
        .card_wanted_right {
            /*border: 1px solid blue;*/
        
        }
        
        .card_wanted_left {
            display: flex;
            flex-direction: column;
            justify-content: center;
            padding-left: 10px;
            font-size: x-large;
        }
        
        .card_wanted_left>p {
            margin-top: 20px;
            display: flex;
            justify-content: center;
            font-size: large;
        
        }
        
        .card_wanted_left>h1 {
            width: 360px;
            display: flex;
            justify-content: center;
        }
        
        .card_wanted_left>span {
            display: flex;
            justify-content: center;
            font-weight: bold;
        
        }
        
        .card_wanted_left .left {
            display: flex;
            color: black;
            font-weight: bold;
            font-style: italic;
            margin-right: 20px;
            justify-content: right;
            margin-top: 30px;
        }
        
        .card_wanted_right {
            display: flex;
            flex-direction: column;
            justify-content: right;
        }
        
        .card_wanted_right>img {
            display: flex;
            padding: 10px;
            border-radius: 15px;
        
        }
        
        .card_wanted_right .name {
            display: flex;
            color: black;
            font-weight: bold;
            justify-content: center;
            padding-bottom: 10px;
        }`;

        return style

    }
}

customElements.define("card-wanted", CardWanted);

