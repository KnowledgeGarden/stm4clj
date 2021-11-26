(ns stm4clj.backside_api)
;; @see https://www.juxt.pro/blog/abstract-clojure#_protocols

(defprotocol IBackside
  (put-proxy [_ proxy])
  (get-proxy [_ locator])
  (delete-proxy [_ locator])


  (find-proxy [_ query])
  (list-proxies [_ offset count])

  )


