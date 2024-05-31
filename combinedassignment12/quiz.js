const quizData = [
    {
        question: "What is the capital of France?",
        options: ["Paris", "London", "Berlin", "Madrid"],
        answer: "Paris"
    },
    {
        question: "Who wrote 'To Kill a Mockingbird'?",
        options: ["Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald"],
        answer: "Harper Lee"
    },
    {
        question: "What is the chemical symbol for water?",
        options: ["H2O", "O2", "CO2", "NaCl"],
        answer: "H2O"
    }
];

let currentQuestionIndex = 0;
let score = 0;

function loadQuestion() {
    const questionContainer = document.getElementById('question-container');
    const optionsContainer = document.getElementById('options-container');

    // Clear previous options
    optionsContainer.innerHTML = "";

    // Load new question
    const currentQuestion = quizData[currentQuestionIndex];
    questionContainer.innerText = currentQuestion.question;

    // Load new options
    currentQuestion.options.forEach(option => {
        const button = document.createElement('button');
        button.innerText = option;
        button.classList.add('option');
        button.onclick = () => selectOption(button, option);
        optionsContainer.appendChild(button);
    });
}

function selectOption(button, selectedOption) {
    const currentQuestion = quizData[currentQuestionIndex];
    const options = document.querySelectorAll('.option');
    options.forEach(option => option.disabled = true); // Disable all options after selection
    if (selectedOption === currentQuestion.answer) {
        score++;
        button.style.backgroundColor = '#28a745'; // Green for correct answer
    } else {
        button.style.backgroundColor = '#dc3545'; // Red for wrong answer
    }
    document.getElementById('next-button').style.display = 'block';
}

function nextQuestion() {
    currentQuestionIndex++;
    if (currentQuestionIndex < quizData.length) {
        loadQuestion();
        document.getElementById('next-button').style.display = 'none';
    } else {
        showScore();
    }
}

function showScore() {
    const quizContainer = document.getElementById('quiz-container');
    quizContainer.innerHTML = `<h2>Your Score: ${score}/${quizData.length}</h2>`;
}

// Initial load
loadQuestion();
