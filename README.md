
### **Technical Specification**

| URI | Method | Status| Description |
|-----|--------|-------|-------------|
|/grandtrivia/questions|GET|200|Get list of all questions and answers|

### **Sample Request and Response**

GET /grandtrivia/questions
````
Response:
[
    {
        "timestamp": "2018-02-02 20:04:25",
        "question": "What did Yankee Doodle stick in his cap?",
        "answers": [
            {
                "text": "Feather",
                "correct": true,
                "choice": "A"
            },
            {
                "text": "Noodle soup",
                "correct": false,
                "choice": "B"
            },
            {
                "text": "Duck",
                "correct": false,
                "choice": "C"
            }
        ],
        "question_num": 1
    }
]