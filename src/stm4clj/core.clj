(ns stm4clj.core
  (:require
    [stm4clj.DhPgBackside :as bc]
    [stm4clj.backsideapi :as api])
  (:gen-class))

(defn foo
  []
  (let [db (bc/->DhPgBackside)]
    (api/put-proxy  db "foo"))
  (println "Hello, World!"))
