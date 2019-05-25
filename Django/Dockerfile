FROM ubuntu:18.04
COPY apt_requirements.txt apt_requirements.txt
RUN apt update
RUN apt install -y python3-pip
RUN pip3 install django
RUN django-admin startproject mysite
RUN cd mysite
COPY requirements.txt requirements.txt
RUN pip install --no-cache-dir -r requirements.txt
EXPOSE 8000
CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"]
