(ns stm4clj.core
  (:require [stm4clj.types :as t]
            [stm4clj.proxy_api :refer [ICoreProxy]]
            [stm4clj.backside_api :refer [IBackside]])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  []
  ;;(bs/boot-db)
  (IBackside/put-proxy "foo")
  (println "Hello, World!"))
