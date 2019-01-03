(ns demail.db)

(def default-db
  {:state :not-logged-in
   :account nil
   :balance nil
   :wallet nil
   :transactions {}
   :pendings {}})
