from django.contrib import admin
from .models import Alumno, Curso, Matriculas

admin.site.register(Alumno)
admin.site.register(Curso)
admin.site.register(Matriculas)
