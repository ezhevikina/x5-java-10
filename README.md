# java-10


Для запуска контейнера с бд atmdb:
```
docker run --name atmdb -it --rm -p 15432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=atm postgres:11
```
