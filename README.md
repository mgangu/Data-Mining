# Data-Mining

Text mining generally refers to the process of extracting interesting patterns or knowledge from unstructured text documents. Some data mining techniques are used to extract the useful information from text documents such as classification, clustering, visualization and information extraction. It is a big challenge to ensure the quality of discovered features because of large scale data patterns.

However, this project is mainly intended to classify general news into five major categories like Business, Politics, Sports Technology and Entertainment. Here, for any given news text, prediction can be done to determine which of the five major categories the news belongs to with the probability obtained. In this, we can even tag a news category with minor categories. For instance, Sports category is divided into several sub categories or minor categories as Football, Cricket, and Hockey etc. For training the model BBC dataset will be used. Machine learning techniques and Natural Language Processing (NLP) are being used for effective outputs.

In order to perform this classification of minor categories, word2vec of gensim package will be used to train the model using Wikipedia dataset. This helps in finding out the similarity between any two words. For the given news text, the similarity score of each word in the news with all the minor categories will be found out and summed up. The category with maximum sum will get predicted as the minor category.


CONTRIBUTION - OPEN PROBLEMS AND FUTURE RESEARCH CHALLENGES:

The information is increasing tremendously day by day and it has become very difficult to maintain it into relevant databases. So, here we are intending to classify the data into relevant groups. However, taking only Naïve Bayes’ would be projecting a problem that data is not being organized well. Similarly, taking into account only one particular algorithm and training the model would not give accurate results. Hence, a combination of two or three different algorithms would assist the model in projecting effective results. 
Testtstst
12347181
