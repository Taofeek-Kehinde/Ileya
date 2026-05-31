const prompt = require("prompt-sync")();

let plainTextMessage = prompt("Enter a word: ");
let shiftAmount = parseInt(prompt("Enter shift number: "));

let encryptedMessage = "";

for (let position = 0; position < plainTextMessage.length; position++) {

    let currentCharacter = plainTextMessage[position];

    let encryptedCharacter = String.fromCharCode(
        currentCharacter.charCodeAt(0) + shiftAmount
    );

    encryptedMessage = encryptedMessage + encryptedCharacter;
}

console.log("Encrypted message: " + encryptedMessage);
