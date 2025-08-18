const questions = [
    {
        question: "Which is the largest planet in our Solar System?",
        options: ["Earth", "Mars", "Jupiter", "Saturn"],
        answer: 2
    },
    {
        question: "What does HTML stand for?",
        options: [
            "Hyper Text Markup Language",
            "Home Tool Markup Language",
            "Hyperlinks and Text Markup Language",
            "Hyper Tool Multi Language"
        ],
        answer: 0
    },
    {
        question: "Which is the fastest land animal?",
        options: ["Cheetah", "Horse", "Tiger", "Leopard"],
        answer: 0
    }
];

let currentQuestionIndex = 0;
let score = 0;
let selectedOption = null;

function loadQuestion() {
    const questionEl = document.getElementById("question");
    const optionBtns = document.querySelectorAll(".option-btn");
    const q = questions[currentQuestionIndex];

    questionEl.textContent = q.question;
    optionBtns.forEach((btn, index) => {
        btn.textContent = q.options[index];
        btn.style.backgroundColor = "#eee";
    });

    document.getElementById("next-btn").style.display = "none";
    selectedOption = null;
}

function selectAnswer(index) {
    selectedOption = index;
    const optionBtns = document.querySelectorAll(".option-btn");

    optionBtns.forEach((btn, i) => {
        btn.style.backgroundColor = i === index ? "#c0ebff" : "#eee";
    });

    document.getElementById("next-btn").style.display = "block";
}

function nextQuestion() {
    if (selectedOption === null) return;

    if (selectedOption === questions[currentQuestionIndex].answer) {
        score++;
    }

    currentQuestionIndex++;
    if (currentQuestionIndex < questions.length) {
        loadQuestion();
    } else {
        showResult();
    }
}

function showResult() {
    const quizEl = document.getElementById("quiz");
    quizEl.innerHTML = `
        <h2>Your Score: ${score} / ${questions.length}</h2>
        <button onclick="restartQuiz()">Restart Quiz</button>
    `;
}

function restartQuiz() {
    currentQuestionIndex = 0;
    score = 0;
    loadQuestion();
}

loadQuestion();
