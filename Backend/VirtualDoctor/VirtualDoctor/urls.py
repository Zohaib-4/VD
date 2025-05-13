from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('admin/', admin.site.urls),
    path('api/users/', include('users.urls')),
    path('', include('emotion.urls')),
    path('', include('sentiment.urls')),
    path('sentiment/', include('sentiment.urls')),
    path('emotion/', include('emotion.urls')),

]