(ns stm4clj.DhPgBackside
  (:require [stm4clj.types :as t]
            [datahike.api :as d]
            [stm4clj.postgres :as pg]
            [stm4clj.backside_api :refer [IBackside]]))
;;;;;;;;;;;
;; This is an IBackside implementation which
;; drives Datahike which is persisting with Postgres
;; @see https://www.juxt.pro/blog/abstract-clojure#_protocols
;;;;;;;;;;;

(defn boot-db
  "boot the database
  Intended to eventually validate there is a database and
  otherwise configure one if not"
  []
  (pg/create-db)
  (println "Booted"))

;; db  = datase - basically Datahike
(deftype DhPgBackside [db]
  IBackside
  (put-proxy [_ proxy]
    (println "Put" proxy)
    nil)
  (get-proxy [_ locator]
    nil)
  (delete-proxy [_ locator]
    nil)


  (find-proxy [_ query]
    nil)
  (list-proxies [_ offset count]
    nil)
)