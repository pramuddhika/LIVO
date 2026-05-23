import { useState } from 'react'
import './App.css'

function App() {
  const [showPassword, setShowPassword] = useState(false)

  const [formData, setFormData] = useState({
    email: '',
    password: '',
    remember: true,
  })

  const updateField = (field: 'email' | 'password' | 'remember', value: string | boolean) => {
    setFormData((current) => ({
      ...current,
      [field]: value,
    }))
  }

  return (
    <main className="login-shell">
      <section className="login-hero" aria-label="LIVO brand overview">
        <div className="brand-mark">
          <span className="brand-dot" />
          <span>LiVO</span>
        </div>

        <div className="hero-copy">
          <p className="eyebrow">Apartment management system</p>
          <h1>Welcome back to smarter community operations.</h1>
          <p className="hero-text">
            Manage tenants, maintenance, notices, and payments from one calm, organized
            workspace built for modern apartment living.
          </p>
        </div>

        <div className="stats-grid" aria-label="Platform highlights">
          <article>
            <strong>128</strong>
            <span>Active units</span>
          </article>
          <article>
            <strong>92%</strong>
            <span>On-time payments</span>
          </article>
          <article>
            <strong>24/7</strong>
            <span>Resident access</span>
          </article>
        </div>
      </section>

      <section className="login-card" aria-label="Login form">
        <div className="card-header">
          <p className="card-kicker">Secure sign in</p>
          <h2>Access your property dashboard</h2>
          <p>Use your LIVO account to continue.</p>
        </div>

        <form className="login-form">
          <label className="field">
            <span>Email address</span>
            <input
              type="email"
              value={formData.email}
              onChange={(event) => updateField('email', event.target.value)}
              placeholder="manager@livo.com"
              autoComplete="email"
            />
          </label>

          <label className="field">
            <span>Password</span>
            <div className="password-row">
              <input
                type={showPassword ? 'text' : 'password'}
                value={formData.password}
                onChange={(event) => updateField('password', event.target.value)}
                placeholder="Enter your password"
                autoComplete="current-password"
              />
              <button
                type="button"
                className="ghost-button"
                onClick={() => setShowPassword((current) => !current)}
              >
                {showPassword ? 'Hide' : 'Show'}
              </button>
            </div>
          </label>

          <div className="form-row">
            <label className="checkbox">
              <input
                type="checkbox"
                checked={formData.remember}
                onChange={(event) => updateField('remember', event.target.checked)}
              />
              <span>Remember me</span>
            </label>

            <a href="#recover">Forgot password?</a>
          </div>

          <button type="submit" className="primary-button">
            Sign in to LIVO
          </button>
        </form>

        <div className="card-footer">
          <p>
            Designed and developed by{' '}
            <a href="https://www.pramuddhika.com" target="_blank" rel="noreferrer">
              Rasanga Pramuddhika
            </a>
          </p>
        </div>
      </section>
    </main>
  )
}

export default App
