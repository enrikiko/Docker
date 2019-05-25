FROM FROM ubuntu:18.04
RUN apt update
RUN apt install python3-pip -y
RUN django-admin startproject mysite
RUN cd mysite
COPY requirements.txt requirements.txt
RUN pip install --no-cache-dir -r requirements.txt
EXPOSE 8000
CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"]
