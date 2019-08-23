#! /bin/bash
text=$(python ./randomSentence.py)
sh makeSomeChange.sh
cd ./Java
git add .
git commit -m "$text"
git push
cd ../
