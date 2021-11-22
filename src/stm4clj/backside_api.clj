(ns stm4clj.backside-api)

(defprotocol backside
  (put [proxy])
  (get [locator])
  (delete [locator])


  (find [query])
  (list_proxies [offset, count])

  )


