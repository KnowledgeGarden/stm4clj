(ns stm4clj.backside-api)

(defprotocol IBackside
  (put-proxy [proxy])
  (get-proxy [locator])
  (delete-proxy [locator])


  (find-proxy [query])
  (list-proxies [offset, count])

  )


