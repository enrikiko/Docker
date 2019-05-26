FROM python:3
WORKDIR /tmp
COPY pip_requirements.txt pip_requirements.txt
RUN pip3 install -r pip_requirements.txt
RUN django-admin startproject mysite
RUN cd mysite
EXPOSE 8000
ENTRYPOINT ["python", "manage.py", "runserver", "0.0.0.0:8000"]
