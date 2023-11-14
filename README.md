# NAI 3
Narzędzia sztucznej Inteligencji.

# Movie Recommendations: Movie or Series Recommendation Engine

This program uses a movie or series recommendation engine based on collaborative filtering. It provides personalized
recommendations for users by analyzing their movie preferences and comparing them with other users in the dataset.

## Authors
- Alicja Szczypior
- Krzysztof Szczypior

## Getting Started

### Prerequisites
To run the Movie Recommendations: Movie or Series Recommendation Engine, you need to have Python 3 installed on your system. If you don't have it, you can download it from the [official Python website](https://www.python.org/).

### Installation
To install the required libraries, you can use pip:

```bash
pip3 install numpy
pip3 install argparse
```

### How To Use It
Your will find in the main.py file the section Movie Recommendations for a Given User. Use the command line to provide user and score type:

python main.py --user <username> --score-type <score_type>

```bash
--user: Input user, as a String.
--score-type: Choose between Euclidean, Pearson, or MSE distance metrics, as a String.
```

### Output
The program will display movie recommendations for the specified user based on the selected score type.

### Program Example

![Pearson](https://github.com/s23578-pj/kolokwiumJAZ/assets/73029891/eeef87b0-086a-4daa-a8e2-9193cde26c95)
![Euclidean](https://github.com/s23578-pj/kolokwiumJAZ/assets/73029891/9c2cfb9e-5533-45a5-a36c-e2f05df890a5)
![MSE](https://github.com/s23578-pj/kolokwiumJAZ/assets/73029891/08892c8b-46e8-4943-af95-dfef47f0c13b)


### Usage
Run the main script with the desired parameters:

```bash
python main.py --user <username> --score-type <Euclidean/Pearson/MSE>
```

Replace '<username>' with the target user's name and <Euclidean/Pearson/MSE> with the desired distance metric.

Data Format
Ensure your movie ratings data is in JSON format and follows the structure outlined below:

```python
{
  "user1": {"movie1": 5, "movie2": 3, ...},
  "user2": {"movie1": 4, "movie3": 1, ...},
  ...
}
```
