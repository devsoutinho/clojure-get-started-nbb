(ns main)

; console.log ("Hello World!") = Baseado em C
(js/console.log "Hello World!") ; Baseado em LISP

; Criando uma função
(def devsoutinho-log-prefix "ds:")
(defn devsoutinho-log [mensagem]
  (js/console.log (str devsoutinho-log-prefix " " mensagem)))

(devsoutinho-log "Hello World!")