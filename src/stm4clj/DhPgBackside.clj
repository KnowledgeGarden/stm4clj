(ns stm4clj.DhPgBackside
  (:require [stm4clj.api.backside_api :as api]
            [datahike.api :as d]
            [stm4clj.postgres :as pg]))
 ;;;;;;;;;;
;; This is an IBackside implementation which
;; drives Datahike which is persisting with Postgres
;; @see https://www.juxt.pro/blog/abstract-clojure#_protocols
;;;;;;;;;;;

;;(defn boot-db
;;  "boot the database
;;  Intended to eventually validate there is a database and
;;  otherwise configure one if not"
;;  []
;;  (pg/create-db)
;;  (println "Booted"))

(defrecord DhPgBackside []
  api/IBackside
  (put-proxy [db proxy]
    (println "Put" proxy)
    nil)
  (get-proxy [db locator]
    nil)
  (delete-proxy [db locator]
    nil)
  (find-proxy [db query]
    nil)
  (list-proxies [db offset count]
    nil)
)