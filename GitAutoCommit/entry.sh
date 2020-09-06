#! /bin/bash
echo "Starting entry.sh"
sh setGitCredentials.sh
cd ./Java
git pull
cd ../
date
date
while [ 1 ]
do
     day=$(date > file | cut -f1 -d " " file)
     echo $day

     if [ "$day" == "Mon" ]
     then
          for i in {1..5}
          do
               sh commit.sh
          done
     fi

     if [ "$day" == "Tue" ]
     then
          for i in {1..10}
          do
               sh commit.sh
          done
     fi

     if [ "$day" == "Wed" ]
     then
          for i in {1..15}
          do
               sh commit.sh
          done
     fi

     if [ "$day" == "Thu" ]
     then
          for i in {1..20}
          do
               sh commit.sh
          done
     fi

     if [ "$day" == "Fri" ]
     then
          for i in {1..25}
          do
               sh commit.sh
          done
     fi

     if [ "$day" == "Sat" ]
     then
          for i in {1..30}
          do
               sh commit.sh
          done
     fi

     if [ "$day" == "Sun" ]
     then
          for i in {1..35}
          do
               sh commit.sh
          done
     fi

     sleep 1d
done
