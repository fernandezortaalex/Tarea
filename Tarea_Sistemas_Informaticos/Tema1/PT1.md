**Primero creamos los directos con mkdir y los archivos con touch**



**Para el segundo ponemos este comando:**

* mkdir backup\_docs \&\& cp docs/manual.txt ../pt1/backup\_docs \&\& cp docs/guia.txt ../pt1/backup\_docs



* cp -r config backup\_docs/



**Para el tercero ponemos estos comandos:**

* mv script1.sh ../test/resultados/
*  mv script2.sh script\_final.sh
* mv backup ../test



**Para el cuarto usamos estos comandos:**

* nano manual.txt
* cat manual.txt
* head -n 10 manual.txt
* head -n 2 manual.txt



**Para el quinto ponemos estos comandos:**

* find pt1 -type f -name "\*.txt"
* find pt1 -type d -name "\*backup\*"
* find pt1 -type f -mtime -1

&nbsp;grep -r "ERROR" pt1/logs/\*.log

**Para el sexto usamos estos comandos:**

* grep -r "ERROR" pt1/\*\*/\*.log
* grep -r --include=\*.log "\[0-9]" pt1/logs/



**Para el séptimo ponemos estos comandos:**

* rm -r pt1/config/{app.cfg,db.cfg}
* rm -r pt1/backup\_docs/
* rm -r pt1/src/modulos/
