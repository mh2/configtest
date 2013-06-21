Seems like Typesafe Config chokes on "[BOM](https://en.wikipedia.org/wiki/Byte_order_mark)'ed" UTF-8 encoded files.

Clone this repo and follow these steps to reproduce the issue:

* either:
   1. run with `sbt run`
      - observe unexceptional behavior
   2. copy `application.conf.bom` to `application.conf` (replacing the existing)
   3. run with `sbt run`
      - observe exceptional behavior (parse error)

* or:
   0. copy `application.conf.nobom` to `application.conf` (replacing the existing)
   1. run with `sbt run`
      - observe unexceptional behavior
   2. edit `application.conf` with Windows Notepad
      - move first line to second line
      - insert a # in the first line
   3. run with `sbt run`
      - observe exceptional behavior (parse error)
      
(The application.conf.* files are found in `src/main/resources`)