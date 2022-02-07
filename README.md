# examen-backend-hacom
para pruebas importar collection o usar los siguientes comandos curl
test-examen.postman_collection.json

#Registrar trace
```bash
curl --location --request POST 'http://localhost:9898/trace' \
--header 'Content-Type: application/json' \
--data-raw '{"sessionId":"MARZO-DDF-DDFS-TH334-FFFF",
"payload":"{\"usuario\":\"juan peres\", \"ciudad\":\"lima\"}"
}'
```

#Listar trace
```bash
curl --location --request GET 'http://localhost:9898/trace' \
--header 'Content-Type: application/json' \
--data-raw '{"from":"2022-02-06T11:42:17.247-05:00",
"to":"2022-02-06T13:42:17.247-05:00"
}'
```
