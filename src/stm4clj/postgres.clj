(ns stm4clj.postgres
  (:require [datahike.api :as d]
            [datahike-postgres.core]))

;; hack adapted from https://github.com/replikativ/datahike-postgres
(def cfg {:store {:backend :pg
                  :host "localhost"
                  :port 5432
                  :user "alice"
                  :password "foo"
                  :dbname "example-db"}})

(defn validate-db
  "Test query; return true if valid
   Must use a general query to see if some artifact exits
   which could toss an exception
  "
  []
  (println "validate")
  true ;; for now
  )

(defn create-db
  "Create a new database if one does not exist"
  []
  (println "create")
  (if-not (validate-db)
        (d/create-database cfg))

  )

