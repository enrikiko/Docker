FROM django:onbuild
RUN django-admin startproject mysite
RUN cd mysite
EXPOSE 8000
CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"]
