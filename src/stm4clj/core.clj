(ns stm4clj.core
  (:require [stm4clj.types :as t]
            [stm4clj.proxy_api :as p]
            [stm4clj.backside-datahike :as bs])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  []
  (bs/boot-db)
  (println "Hello, World!"))
