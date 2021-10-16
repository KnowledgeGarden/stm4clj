(ns stm4clj.core
  (:require [stm4clj.types :as t]
            [stm4clj.protocols :as p]
            [datahike.api :as d]
            [stm4clj.postgres :as pg])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  []
  (pg/create-db)
  (println "Hello, World!"))
