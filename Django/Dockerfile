FROM python:3
WORKDIR /tmp
#COPY apt_requirements.txt apt_requirements.txt
COPY pip_requirements.txt pip_requirements.txt
#RUN cat apt_requirements.txt
RUN cat pip_requirements.txt
#RUN apt update
#RUN apt install -y python3-pip
RUN pip3 install -r pip_requirements.txt
RUN django-admin startproject mysite
RUN cd mysite
#EXPOSE 8000
CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"]
