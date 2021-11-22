(ns stm4clj.backside-datahike
  (:require [stm4clj.types :as t]
            [datahike.api :as d]
            [stm4clj.postgres :as pg]
            [stm4clj.backside-api :as api]))

(defn boot-db
  "boot the database"
  []
  (pg/create-db)
  (println "Booted"))

