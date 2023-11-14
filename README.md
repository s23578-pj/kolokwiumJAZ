# Movie Recommendations: Movie or Series Recommendation Engine

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

How To Use It
Your will find in the main.py file the section Movie Recommendations for a Given User. Use the command line to provide user and score type:

python main.py --user <username> --score-type <score_type>

--user: Input user, as a String.
--score-type: Choose between Euclidean, Pearson, or MSE distance metrics, as a String.

Output
The program will display movie recommendations for the specified user based on the selected score type.

Usage

1. clone the repository:

git clone https://github.com/your-username/movies-recommendation.git
cd movies-recommendation

2. Run the main script with the desired parameters:

python main.py --user <username> --score-type <Euclidean/Pearson/MSE>

Replace '<username>' with the target user's name and <Euclidean/Pearson/MSE> with the desired distance metric.

Data Format
Ensure your movie ratings data is in JSON format and follows the structure outlined below:

{
  "user1": {"movie1": 5, "movie2": 3, ...},
  "user2": {"movie1": 4, "movie3": 1, ...},
  ...
}
